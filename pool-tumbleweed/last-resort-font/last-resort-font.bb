SUMMARY = "A special-purpose font that includes a collection of glyphs to represent types of Unicode characters"
DESCRIPTION = "Last Resort is a special-purpose font that includes a collection of glyphs to \
represent types of Unicode characters.  These glyphs are specifically designed \
to allow users to recognize that a code point is one of the following: \
 \
* A specific type of Unicode character \
* In the PUA (Private Use Area) for which no agreement exists \
* Unassigned (reserved for future assignment) \
* A noncharacter"
LICENSE = "OFL-1.1"

PV = "17.000"

RPM_NAME = "last-resort-font-17.000-1.2.noarch.rpm"
RPM_HASH = "a21d8ccf89953b2f32160ed1ff557a52b992635b6fb9a65571ad3830ca98fe5328112aa8bab817f014a25388aca102e777fba656b7c3285c434e342d48a7e896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "last-resort-font"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
