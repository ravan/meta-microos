SUMMARY = "YaST2 - PAM Agent"
DESCRIPTION = "This agent is used by YaST2 to modify the PAM configuration files"
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-pam-5.0.0-1.14.noarch.rpm"
RPM_HASH = "99852546a66305015af7ed3af24c4f5c2a5ea893a3d0c9b4ab4c2af7c3a1adeb09fdd2306e4d1e0af2d03ffe97bbc2c2d7c7f8c020c7d52001162423e49599b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-pam"

RDEPENDS:${PN} += "/usr/bin/perl \
augeas-lenses \
pam-config \
rubygem-ruby-4.0.0-cfa \
yast2 \
yast2-ruby-bindings"

inherit rpm
