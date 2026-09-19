SUMMARY = "Wrapper script to launch Compiz with proper options"
DESCRIPTION = "This script detects what options to pass to Compiz to get it \
started, and start a default plugin and possibly window decorator."
LICENSE = "GPL-2.0+"

PV = "0.7.0"

RPM_NAME = "compiz-manager-0.7.0-2.9.noarch.rpm"
RPM_HASH = "8f489add06f11022a1badb65c9d23681cb32c0b6bacbed3b2127968f378e8e91ce954b11203e07a56b4305eb1f6db5b33fcfb97de211341cb1d72699c4c73296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-manager"

RDEPENDS:${PN} += "/usr/bin/bash \
compiz \
util-linux"

inherit rpm
