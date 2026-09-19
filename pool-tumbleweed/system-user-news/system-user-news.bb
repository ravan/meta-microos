SUMMARY = "System user and group 'news'"
DESCRIPTION = "This package provides the system account and group 'news' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-news-20250822-2.3.noarch.rpm"
RPM_HASH = "4339b84a5f7a58be7c7d52c739769e281f294f721de358cdf4655c7fff409042717c4998eb09a6beeedd871eeef9123a6f1a797dea43e6f4909b9b86ee3b70f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-news \
system-user-news \
user-news"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
