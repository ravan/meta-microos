SUMMARY = "Documentation how to Use and Program with the Readline Library"
DESCRIPTION = "This package contains the documentation for using the readline library \
as well as programming with the interface of the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "readline-doc-8.3.3-2.6.noarch.rpm"
RPM_HASH = "997344a71e2286ed1b453980a3ee54f2b7888fd1edb122adb8f5fc0b8eafa8db14653effe43f457827350d5f7f291d4d0bbb3ad798b511b85b6714cb95a76018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "readline-/usr/share/info/readline.info.gz \
readline-doc"

RDEPENDS:${PN} += ""

inherit rpm
