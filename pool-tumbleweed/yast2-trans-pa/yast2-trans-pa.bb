SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-pa-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "0f43e250a630202401080cab69e988e962d48e11b9b17ffe6d30849e8a8a0a1831fb9222ed98b368ccb1783f92ab7e5292bbd5ec918dc5afce075caffeb670b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pa \
yast2-trans-pa"

RDEPENDS:${PN} += ""

inherit rpm
