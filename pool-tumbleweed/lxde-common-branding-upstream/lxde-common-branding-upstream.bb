SUMMARY = "Upstream branding"
DESCRIPTION = "This branding-style package sets default applications in LXDE in openSUSE. \
This is a dumb package, which provides only upstream LXDE configurations as preferred defaults. \
You most probably don't want this package. You probably want to install distribution default \
lxde-common-branding and prefer openSUSE default settings."
LICENSE = "GPL-2.0"

PV = "0.99.2"

RPM_NAME = "lxde-common-branding-upstream-0.99.2-2.27.noarch.rpm"
RPM_HASH = "0b618bdfdce7c6f988500f1e11d38033d8ee9853a1e5774529d5bc16a3026fe828c3986620e082d6e8951a8526bfc25aad3931ffa7c2cb87a999e1fce6a96a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxde-common-branding-upstream \
lxde-common-branding \
lxde-common-branding-upstream"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
