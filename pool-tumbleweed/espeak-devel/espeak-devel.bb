SUMMARY = "Software speech synthesizer (text-to-speech) -- Development Files"
DESCRIPTION = "eSpeak is a compact open source software speech synthesizer for English \
and other languages. \
 \
eSpeak uses a 'formant synthesis' method. This allows many languages to \
be provided in a small size. The speech is clear, and can be used at \
high speeds, but is not as natural or smooth as larger synthesizers \
which are based on human speech recordings."
LICENSE = "GPL-3.0-or-later"

PV = "1.48.04"

RPM_NAME = "espeak-devel-1.48.04-8.9.aarch64.rpm"
RPM_HASH = "1a9037730a8448865626d71fa9f173058988501c48b846c15d2572c3ea0f54c1f458444db39b7df23a296734ea7080a7c88b1fbbc6946140e7443fc715963378"

RPROVIDES:${PN} += "espeak-devel"

RDEPENDS:${PN} += "espeak"

inherit rpm
