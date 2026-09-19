SUMMARY = "YAML processor for JRuby"
DESCRIPTION = "YAML processor extracted from JRuby."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "jvyamlb-0.2.5-20.16.noarch.rpm"
RPM_HASH = "04ca4d96cbe74d3fe3aea9bdc9127d418b7233fe42a8d587e23dd2dd2d174bc7ea0e9d37714fb71f94b9040919c19d3e8b2ce42394fb827e47a9f3e76d2af87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jvyamlb"

RDEPENDS:${PN} += "bytelist \
java \
javapackages-tools \
jcodings \
joda-time"

inherit rpm
