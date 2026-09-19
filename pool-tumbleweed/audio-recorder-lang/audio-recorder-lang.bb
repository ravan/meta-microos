SUMMARY = "Translations for package audio-recorder"
DESCRIPTION = "Provides translations for the 'audio-recorder' package."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "audio-recorder-lang-3.3.4-3.5.noarch.rpm"
RPM_HASH = "a5f24ada1928a4833799cf8fe1e73ae28c1a43a43f2f8b3bca53b4712004a68c3afd630319e124e2cd2bce1d20a6da6ac19ad2324792af9d4999d59295da741a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audio-recorder-lang \
audio-recorder-lang-all \
locale-audio-recorder-af \
locale-audio-recorder-ar \
locale-audio-recorder-ca \
locale-audio-recorder-cs \
locale-audio-recorder-de \
locale-audio-recorder-el \
locale-audio-recorder-en-AU \
locale-audio-recorder-en-GB \
locale-audio-recorder-es \
locale-audio-recorder-eu \
locale-audio-recorder-fi \
locale-audio-recorder-fr \
locale-audio-recorder-gl \
locale-audio-recorder-he \
locale-audio-recorder-hr \
locale-audio-recorder-hu \
locale-audio-recorder-it \
locale-audio-recorder-lt \
locale-audio-recorder-ms \
locale-audio-recorder-nb \
locale-audio-recorder-nl \
locale-audio-recorder-pl \
locale-audio-recorder-pt \
locale-audio-recorder-pt-BR \
locale-audio-recorder-ru \
locale-audio-recorder-sk \
locale-audio-recorder-sr \
locale-audio-recorder-sv \
locale-audio-recorder-tr \
locale-audio-recorder-uk \
locale-audio-recorder-vi \
locale-audio-recorder-zh-CN \
locale-audio-recorder-zh-TW"

RDEPENDS:${PN} += "audio-recorder"

inherit rpm
