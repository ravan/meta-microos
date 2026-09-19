SUMMARY = "The Waf build system"
DESCRIPTION = "Waf is a Python-based framework for configuring, compiling and installing applications."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "waf-2.1.4-1.4.noarch.rpm"
RPM_HASH = "54e43af3fe970084f7105e1ed2845499f8adde8ee48017f557739c7853a3264d71120193014f35f938b8ccf3ceddc8a095f4577c30a3307e452c55ef5365078e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "waf"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
