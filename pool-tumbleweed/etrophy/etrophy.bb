SUMMARY = "Library managing scores, trophies and unlockables"
DESCRIPTION = "ETrophy is a library that manages scores, trophies and unlockables. It will \
store them and provide views to display them. Could be used by games based \
on EFL."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "etrophy-0.5.1-8.38.aarch64.rpm"
RPM_HASH = "f802391f2b04c6756a579c27d6c037f3f75b6ce0654284494e60d9284058e728550a0b89311641c595452cf8a48844f81feeed6e9ecbf8a314f3d202a26b0dac"

RPROVIDES:${PN} += "etrophy"

RDEPENDS:${PN} += ""

inherit rpm
