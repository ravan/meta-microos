SUMMARY = "Walloon (walon) Dictionary for Aspell"
DESCRIPTION = "A Walloon (walon) Dictionarydictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-wa-0.50-4.7.aarch64.rpm"
RPM_HASH = "8bc1cb124b92e9604d9c236a42881ec2e52fe7f10b325091af7c9b3b2014e93768fb6614ecdfa1b321adefe7285f94ae08009b02a9746ab031706d174f98bf7a"

RPROVIDES:${PN} += "aspell-wa \
locale-aspell-wa"

RDEPENDS:${PN} += ""

inherit rpm
