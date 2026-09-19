SUMMARY = "Terminal based emoji chooser"
DESCRIPTION = "moji is a terminal based emoji chooser for *nix. With tuimoji you can search and browse emojis and copy them to your clipboard without ever leaving the comfort of your terminal."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "tuimoji-1.0.0-1.20.noarch.rpm"
RPM_HASH = "057bde8ea58c4ecf6eac9bc27462d0caa551155f40b698d2343aae633c2606a6d7a50cba6cb2bd970563cfbe0fb550a32aa6861b73acf5c293941effe03d878e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-tuimoji \
python3dist-tuimoji \
tuimoji"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-urwid \
xclip"

inherit rpm
