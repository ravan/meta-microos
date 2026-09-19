SUMMARY = "Mobile Service Provider Database"
DESCRIPTION = "This package contains mobile broadband settings for different service \
providers in different countries."
LICENSE = "SUSE-Public-Domain"

PV = "20240407"

RPM_NAME = "mobile-broadband-provider-info-20240407-2.2.noarch.rpm"
RPM_HASH = "78e7669290153adfbb09028b62422436aaa291bacd9523495a792cbe1c0f1076c53c61c7b7226b4f8b23c39cf4c723e845af72a81947786b8de34f7ea426df5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mobile-broadband-provider-info \
pkgconfig-mobile-broadband-provider-info"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
