package com.external.stage;

import com.streamsets.pipeline.api.*;

/**
 * Created by harikiran on 10/22/14.
 */
@StageDef(name = "TwitterTarget", description = "Consumes twitter feeds", label = "twitter_target"
, version = "1.3")
public class TwitterTarget implements Target {

  @ConfigDef(
    name = "username",
    defaultValue = "admin",
    label = "username",
    required = true,
    description = "The user name of the twitter user",
    type = ConfigDef.Type.STRING
  )
  private final String username;

  @ConfigDef(
    name = "password",
    defaultValue = "admin",
    label = "password",
    required = true,
    description = "The password the twitter user",
    type = ConfigDef.Type.STRING
  )
  private final String password;

  public TwitterTarget(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public static void main(String[] args) {
    System.out.println("Hellow world");
  }

  @Override
  public void write(Batch batch) throws PipelineException {

  }

  @Override
  public void init(Info info, Context context) throws PipelineException {

  }

  @Override
  public void destroy() {

  }
}

