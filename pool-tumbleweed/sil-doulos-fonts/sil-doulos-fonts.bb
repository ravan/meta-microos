SUMMARY = "A font that provides complete support for the International Phonetic Alphabet"
DESCRIPTION = "Doulos SIL is a Unicode-based font family that supports the wide \
range of languages that use the Latin and Cyrillic scripts, whether \
used for phonetic or orthographic needs. Linguists appreciate the \
wide range of characters and symbols useful in their work."
LICENSE = "OFL-1.1"

PV = "7.000"

RPM_NAME = "sil-doulos-fonts-7.000-1.4.noarch.rpm"
RPM_HASH = "b8c9081c37f02daa68ba9862880e0c640f0166377d861760cd08a20bd67a8e24bf1228566c704ba8efbbc15ce3ac43f3a1f264631576fff9caf35d134a6296ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-doulos \
sil-doulos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
