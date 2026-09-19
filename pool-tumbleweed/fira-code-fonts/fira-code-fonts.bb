SUMMARY = "Free monospaced font with programming ligatures"
DESCRIPTION = "Fira Code is a free monospaced font containing ligatures for common programming multi-character combinations. This is just a font rendering feature: underlying code remains ASCII-compatible. This helps to read and understand code faster."
LICENSE = "OFL-1.1"

PV = "6.2"

RPM_NAME = "fira-code-fonts-6.2-1.13.noarch.rpm"
RPM_HASH = "7d9df42ff96d228a29755a7bab81673dbb7d6f6714ca503a2f634182983ff0302b533738230a6ab163de4723d5809eb5842a54c00c42c51e08ad58afb9fe4006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fira-code-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
