SUMMARY = "Web analytics platform"
DESCRIPTION = "Matomo, formerly Piwik, is a web analytics platform that gives \
insights into a website's visitors and marketing campaigns, so the \
strategy and online experience of visitors may be optimized."
LICENSE = "GPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "matomo-5.13.0-1.1.noarch.rpm"
RPM_HASH = "d70acb5ed8ecabb5861eb00d4d3e59e30c0978d072a59134ade595cac8eae6f5b93d4819a9996678e76b7a9a92bf822d53b6cc1c46dbd034f0695beba8fd1b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-matomo \
matomo"

RDEPENDS:${PN} += "/usr/bin/php \
/usr/bin/python3 \
/usr/bin/sh \
group-www \
logrotate \
nodejs \
php \
php-ctype \
php-curl \
php-dom \
php-gd \
php-iconv \
php-json \
php-mbstring \
php-mysql \
php-pdo \
php-tokenizer \
php-xmlreader \
php-xmlwriter \
php-zlib \
python3 \
systemd \
user-wwwrun"

inherit rpm
