SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kmbox-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "cc98863aaaaa529994cb084e6afac695dc07d50c67af66610c909489e8a40ad159c461550b47b857024d5255b3169dd337a0df3a35746b162821482cfeaae93b"

RPROVIDES:${PN} += "kmbox"

RDEPENDS:${PN} += ""

inherit rpm
