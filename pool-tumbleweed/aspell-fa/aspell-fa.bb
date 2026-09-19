SUMMARY = "Persian (فارسی) Dictionary for Aspell"
DESCRIPTION = "A Persian (فارسی) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.0"

RPM_NAME = "aspell-fa-0.11.0-4.7.aarch64.rpm"
RPM_HASH = "cc001757adf81b8a15957c47ac7f2bf2503c427fecfb219e3ed72348436d2dd66cc1254f6c3bc9c6cca71c4ac33823bbd7eed6a9b910159a7e53ea9c8321d295"

RPROVIDES:${PN} += "aspell-fa \
locale-aspell-fa"

RDEPENDS:${PN} += ""

inherit rpm
