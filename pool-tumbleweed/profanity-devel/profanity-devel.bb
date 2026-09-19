SUMMARY = "Development files for the libprofanity XMPP client library"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, and \
inspired by Irssi. \
 \
This package contains the files needed to build with libprofanity."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.18.2"

RPM_NAME = "profanity-devel-0.18.2-1.3.aarch64.rpm"
RPM_HASH = "8d73e6d1a53422b4e5757d665959f71544736f528036c650ebd4067538a5e8062bfaab384a16fe9c1bc397ec5c69e3779145fbdb87c02925833a79865bdcf1a3"

RPROVIDES:${PN} += "profanity-devel"

RDEPENDS:${PN} += "libprofanity0"

inherit rpm
