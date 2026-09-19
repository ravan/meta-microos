SUMMARY = "Rofi frontend to pinentry"
DESCRIPTION = "Simple pinentry gui using rofi. \
 \
It's similar in functionality as the gist and the previous \
script, but on the MicroOS, where I work now, it is essential \
to install as few as possible additional software, so Guile is \
certainly too much. \
 \
To use pinentry-rofi with gpg-agent, you can set it as the \
pinentry-program in the ~/.gnupg/gpg-agent.conf. Note that you \
need to use the full path to the binary."
LICENSE = "GPL-3.0-or-later+"

PV = "2.1.0"

RPM_NAME = "pinentry-rofi-2.1.0-1.3.noarch.rpm"
RPM_HASH = "41f26f8b32e5d3a7970a3cfe7c06643e53031970c9264364ac3d72d1f0e89b15301f6795da93a775c331747ef906084ebc72bd39ba31d2c54351223e2f234426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pinentry-rofi"

RDEPENDS:${PN} += "/usr/bin/lua \
gpg \
lua \
rofi-launcher"

inherit rpm
