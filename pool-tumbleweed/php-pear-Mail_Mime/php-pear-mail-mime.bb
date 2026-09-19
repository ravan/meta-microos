SUMMARY = "PHP classes to create MIME messages"
DESCRIPTION = "Mail_Mime provides classes to deal with the creation and manipulation \
of MIME messages. It allows to create e-mail messages consisting of \
text parts, HTML parts, inline HTML images, attachments and attached \
(embedded) messages. It supports non-ASCII characters in filenames, \
subjects, recipients, etc."
LICENSE = "BSD-3-Clause"

PV = "1.10.12"

RPM_NAME = "php-pear-Mail_Mime-1.10.12-1.8.noarch.rpm"
RPM_HASH = "200897ef632bc20c2c6be6cf7f87714718e394dfbb7f7f6b035b4e20e5dd425da222780c7548e35bdaac996d33038a46de49027e8792d0a8948280b6289bd06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Mail-Mime \
php5-pear-Mail-Mime \
php7-pear-Mail-Mime"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear"

inherit rpm
