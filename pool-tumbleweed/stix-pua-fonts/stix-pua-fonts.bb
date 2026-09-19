SUMMARY = "STIX scientific and engineering fonts, PUA glyphs"
DESCRIPTION = "This package includes fonts containing glyphs called out from the Unicode \
Private Use Area (PUA) range. Glyphs in this range do not have an official \
Unicode codepoint. They're generally accessible only through specialised \
software. Text using them will break if they're ever accepted by the Unicode \
Consortium and moved to an official codepoint."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-pua-fonts-1.1.0-12.26.noarch.rpm"
RPM_HASH = "c16dea0797f31f1ff36165a48ceaf3bb9f9135243c3f9acab7675ef930e40f694983b9709d211a7b3eaa01def13e709fc939f20892e3eebe887b2f20a9215cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-stix-pua-fonts \
font-stixnonunicode \
stix-pua-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl \
stix-fonts"

inherit rpm
