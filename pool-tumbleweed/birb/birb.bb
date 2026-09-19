SUMMARY = "A library of utilities for GLib based apps"
DESCRIPTION = "Description is in development \
A library of utilities for GLib based apps."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "birb-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "7a215853b9e1dad9585e5d5ea5a8bb19fd3746f1e617b6bf537e16b057a6d724eae456b3dcfe16295953fb97622aa5e04a8e059566d61835dbc80faa23ca60af"

RPROVIDES:${PN} += "birb"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
