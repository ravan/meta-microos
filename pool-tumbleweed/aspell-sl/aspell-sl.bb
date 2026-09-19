SUMMARY = "Slovenian (slovenski) Dictionary for Aspell"
DESCRIPTION = "A Slovenian (slovenski) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-sl-0.50-4.7.aarch64.rpm"
RPM_HASH = "79ad7d52d27fe671e403d7c126899791580060b6c3174fcff064ad8e16cb13f8712aca1e3b154fb852c844585602bb77fde675471c00e3b6fd8024776b13ba82"

RPROVIDES:${PN} += "aspell-sl \
locale-aspell-sl"

RDEPENDS:${PN} += ""

inherit rpm
