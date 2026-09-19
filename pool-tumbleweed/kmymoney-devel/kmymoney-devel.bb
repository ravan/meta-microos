SUMMARY = "Development Files for KMyMoney"
DESCRIPTION = "Development files and headers need to build software using KMyMoney."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.2.2"

RPM_NAME = "kmymoney-devel-5.2.2-1.7.aarch64.rpm"
RPM_HASH = "ba49f11d8d1f9f687980421745ee1a73767266699da06974a3ccb503bba81ca7d1536e1d436b5d41a7bb16a11685f758316d9ad5a40dfbab38d4ac299b087bb3"

RPROVIDES:${PN} += "kmymoney-devel"

RDEPENDS:${PN} += "kmymoney"

inherit rpm
