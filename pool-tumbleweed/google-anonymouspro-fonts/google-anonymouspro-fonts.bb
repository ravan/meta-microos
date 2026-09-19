SUMMARY = "A Free Monospace Font"
DESCRIPTION = "Anonymous Pro is a family of four fixed-width fonts designed especially \
with coding in mind. Characters that could be mistaken for one another \
(O, 0, I, l, 1, etc.) have distinct shapes to make them easier to tell \
apart in the context of source code. \
 \
Anonymous Pro also features an international, Unicode-based character set, \
with support for most Western and European Latin-based languages, Greek, \
and Cyrillic. It also includes special 'box drawing' characters for those \
who need them. \
 \
Designer: Mark Simonson"
LICENSE = "OFL-1.1"

PV = "1.002"

RPM_NAME = "google-anonymouspro-fonts-1.002-12.9.noarch.rpm"
RPM_HASH = "e8b9fae9eeec9286f4a33348712db0c7351ceb916bacd32f4664a2b5fe3094ec5512a86e32971e5b7a776b012828143f14c4aca3b8f7b28d9345cbdf99cecc26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-anonymouspro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
