SUMMARY = "Nginx Integration for dehydrated"
DESCRIPTION = "This adds a configuration file for dehydrated's acme-challenge to nginx."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-nginx-0.7.1-3.8.noarch.rpm"
RPM_HASH = "e1d9012b07028349d689f131f1878205578a83566834b494aa9b455aa5cfba84030d4069febfa325b9b8199ee5e5de36c6496439fa04780e81b11275e841220d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated-nginx \
dehydrated-nginx \
letsencrypt.sh-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
dehydrated \
group-nginx \
nginx"

inherit rpm
