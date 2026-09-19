SUMMARY = "Java NFA regular expression engine"
DESCRIPTION = "The gnu-regexp package is a pure-Java implementation of a traditional \
(non-POSIX) NFA regular expression engine. Its syntax can emulate many \
popular development tools, including awk, sed, emacs, perl and grep. \
For a relatively complete list of supported and non-supported syntax, \
refer to the syntax and usage notes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-1.1.4-293.25.noarch.rpm"
RPM_HASH = "dd5d524009adf2c05908bb86eecd81ddb745d6dd786d5db0ef998fbe4c1145ec8cc8ae22dba33a1a9ba951ddd062bd0e0f71dcbe9417186722858cacec2690a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp"

RDEPENDS:${PN} += ""

inherit rpm
