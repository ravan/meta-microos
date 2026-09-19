SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-Leap-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "3e0f1b2531c6b5e3264ca7ca1ba0ac26262a2daa0d86d87499a5da45ad0f9dfde5587d744e9a2821e2c74ebf1e893d5744f7239e0f8666fd90db42a569e3b169"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-Leap"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
