SUMMARY = "PulseAudio zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for various PulseAudio utilities"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-zsh-completion-17.0-7.5.aarch64.rpm"
RPM_HASH = "7b05131c036908a813aa62e82f07502935940aa6e5549428a16247aae84c4f89cc182566cb6fbe60fb3c270a3c33026074fbbdca955285ed948813314f6f16a5"

RPROVIDES:${PN} += "pulseaudio-zsh-completion"

RDEPENDS:${PN} += "pulseaudio-utils \
zsh"

inherit rpm
