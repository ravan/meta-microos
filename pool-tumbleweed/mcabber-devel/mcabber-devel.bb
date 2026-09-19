SUMMARY = "Headers for modular XMPP client on ncurses"
DESCRIPTION = "mcabber is a small XMPP console client on ncurses. It features \
SSL support, history logging, external actions, OTR support, \
conferences (MUC) support."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "mcabber-devel-1.1.2-3.6.aarch64.rpm"
RPM_HASH = "393e72e5dd856caa84a384963a14058b41c1fb17c8b17970c8ae9162ec4a01553f5798a0682378b5ade1a352676c61f159139e901ccd08a8d85ef8902e5466ab"

RPROVIDES:${PN} += "mcabber-devel \
pkgconfig-mcabber"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mcabber \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-loudmouth-1.0"

inherit rpm
