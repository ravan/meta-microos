SUMMARY = "Command Line Interface to the X11 Clipboard"
DESCRIPTION = "xclip is a command line interface to the X11 clipboard. It can also be used \
for copying files, as an alternative to sftp/scp, thus avoiding password \
prompts when X11 forwarding has already been setup."
LICENSE = "GPL-2.0-or-later"

PV = "0.13+git20220129"

RPM_NAME = "xclip-0.13+git20220129-1.9.aarch64.rpm"
RPM_HASH = "e0c2d4ead29468ac694c2be6328fd709d66298a91230e4ea5a53ed93ceee076f80a8fd75eb21372927b95ed936b5498d2c98e9169d15387e0b07d7a72cbbeba3"

RPROVIDES:${PN} += "xclip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6"

inherit rpm
