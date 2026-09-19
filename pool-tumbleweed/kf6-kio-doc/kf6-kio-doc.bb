SUMMARY = "HTML documentation for KIO"
DESCRIPTION = "This package contains documentation for the KIO framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kio-doc-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4d63e753abfff56da37a1e97362f51a62a199c23543542ca2289a38e8fcd3eaec715d6351f9e9cb83d13bc322d49d5a412bd53eef97a62fb3e1f5e1e8011a76f"

RPROVIDES:${PN} += "kf6-kio-doc"

RDEPENDS:${PN} += ""

inherit rpm
