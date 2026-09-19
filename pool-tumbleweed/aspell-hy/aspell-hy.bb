SUMMARY = "Armenian (Հայերեն) Dictionary for Aspell"
DESCRIPTION = "An Armenian (Հայերեն) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0"

RPM_NAME = "aspell-hy-0.10.0-4.7.aarch64.rpm"
RPM_HASH = "12104f37754466e02ca10f291349c239f0da0322b0d55add3c88acd6362eea0271f3a2cb0a0dba316c8502be8c24d2ebf7d79d5a55eb8418ee6008598442a7ee"

RPROVIDES:${PN} += "aspell-hy \
locale-aspell-hy"

RDEPENDS:${PN} += ""

inherit rpm
