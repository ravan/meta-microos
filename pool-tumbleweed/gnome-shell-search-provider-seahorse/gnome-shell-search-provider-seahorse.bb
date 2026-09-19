SUMMARY = "GNOME interface for gnupg -- Search Provider for GNOME Shell"
DESCRIPTION = "Seahorse is a GNOME interface for gnupg. It uses gpgme as the backend. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from seahorse."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "47.0.1+6"

RPM_NAME = "gnome-shell-search-provider-seahorse-47.0.1+6-3.4.noarch.rpm"
RPM_HASH = "1a7427220c0d5b1c95847714c58b71c8b11f5b9bd42e533a8276b38f18dba8c9cb0405d5c5744a86ca608912fa2728a816b2ec765a726a4d3225be7a2aefd87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-seahorse"

RDEPENDS:${PN} += ""

inherit rpm
