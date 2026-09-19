SUMMARY = "A Health and Hospital Information System"
DESCRIPTION = "GNU Health is the Hospital Information System adopted by the United \
Nations University, International Institute for Global Health, for \
the implementations and trainings. \
 \
This is the server component of GNU Health. \
You would need the GNU Health Client as well, on the same or a different machine. \
You may use the Tryton Client either \
See https://en.opensuse.org/GNUHealth_on_openSUSE for instructions"
LICENSE = "GPL-3.0-or-later"

PV = "5.0.7"

RPM_NAME = "gnuhealth-5.0.7-1.2.noarch.rpm"
RPM_HASH = "df86a057f7ad9f45fc01264a7cc4d14880eabab8ed63a3062816c5ca6c5a220c79db606f39028d1300f5dff67c875b27ad5ab0238ff7fa726f122cc6c2bd37e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth \
python3.13dist-gnuhealth \
python3.13dist-gnuhealth-archives \
python3.13dist-gnuhealth-caldav \
python3.13dist-gnuhealth-calendar \
python3.13dist-gnuhealth-contact-tracing \
python3.13dist-gnuhealth-crypto \
python3.13dist-gnuhealth-crypto-lab \
python3.13dist-gnuhealth-dentistry \
python3.13dist-gnuhealth-disability \
python3.13dist-gnuhealth-ems \
python3.13dist-gnuhealth-federation \
python3.13dist-gnuhealth-genetics \
python3.13dist-gnuhealth-genetics-uniprot \
python3.13dist-gnuhealth-gyneco \
python3.13dist-gnuhealth-history \
python3.13dist-gnuhealth-icd10 \
python3.13dist-gnuhealth-icd10pcs \
python3.13dist-gnuhealth-icd11 \
python3.13dist-gnuhealth-icd9procs \
python3.13dist-gnuhealth-icpm \
python3.13dist-gnuhealth-icu \
python3.13dist-gnuhealth-imaging \
python3.13dist-gnuhealth-inpatient \
python3.13dist-gnuhealth-inpatient-calendar \
python3.13dist-gnuhealth-insurance \
python3.13dist-gnuhealth-iss \
python3.13dist-gnuhealth-lab \
python3.13dist-gnuhealth-lifestyle \
python3.13dist-gnuhealth-mdg6 \
python3.13dist-gnuhealth-ntd \
python3.13dist-gnuhealth-ntd-chagas \
python3.13dist-gnuhealth-ntd-dengue \
python3.13dist-gnuhealth-nursing \
python3.13dist-gnuhealth-ophthalmology \
python3.13dist-gnuhealth-pediatrics \
python3.13dist-gnuhealth-pediatrics-growth-charts \
python3.13dist-gnuhealth-pediatrics-growth-charts-who \
python3.13dist-gnuhealth-qrcodes \
python3.13dist-gnuhealth-reporting \
python3.13dist-gnuhealth-services \
python3.13dist-gnuhealth-services-imaging \
python3.13dist-gnuhealth-services-lab \
python3.13dist-gnuhealth-socioeconomics \
python3.13dist-gnuhealth-stock \
python3.13dist-gnuhealth-stock-inpatient \
python3.13dist-gnuhealth-stock-nursing \
python3.13dist-gnuhealth-stock-surgery \
python3.13dist-gnuhealth-surgery \
python3.13dist-gnuhealth-surgery-protocols \
python3.13dist-gnuhealth-webdav3-server \
python3.13dist-gnuhealth-who-essential-medicines \
python3dist-gnuhealth \
python3dist-gnuhealth-archives \
python3dist-gnuhealth-caldav \
python3dist-gnuhealth-calendar \
python3dist-gnuhealth-contact-tracing \
python3dist-gnuhealth-crypto \
python3dist-gnuhealth-crypto-lab \
python3dist-gnuhealth-dentistry \
python3dist-gnuhealth-disability \
python3dist-gnuhealth-ems \
python3dist-gnuhealth-federation \
python3dist-gnuhealth-genetics \
python3dist-gnuhealth-genetics-uniprot \
python3dist-gnuhealth-gyneco \
python3dist-gnuhealth-history \
python3dist-gnuhealth-icd10 \
python3dist-gnuhealth-icd10pcs \
python3dist-gnuhealth-icd11 \
python3dist-gnuhealth-icd9procs \
python3dist-gnuhealth-icpm \
python3dist-gnuhealth-icu \
python3dist-gnuhealth-imaging \
python3dist-gnuhealth-inpatient \
python3dist-gnuhealth-inpatient-calendar \
python3dist-gnuhealth-insurance \
python3dist-gnuhealth-iss \
python3dist-gnuhealth-lab \
python3dist-gnuhealth-lifestyle \
python3dist-gnuhealth-mdg6 \
python3dist-gnuhealth-ntd \
python3dist-gnuhealth-ntd-chagas \
python3dist-gnuhealth-ntd-dengue \
python3dist-gnuhealth-nursing \
python3dist-gnuhealth-ophthalmology \
python3dist-gnuhealth-pediatrics \
python3dist-gnuhealth-pediatrics-growth-charts \
python3dist-gnuhealth-pediatrics-growth-charts-who \
python3dist-gnuhealth-qrcodes \
python3dist-gnuhealth-reporting \
python3dist-gnuhealth-services \
python3dist-gnuhealth-services-imaging \
python3dist-gnuhealth-services-lab \
python3dist-gnuhealth-socioeconomics \
python3dist-gnuhealth-stock \
python3dist-gnuhealth-stock-inpatient \
python3dist-gnuhealth-stock-nursing \
python3dist-gnuhealth-stock-surgery \
python3dist-gnuhealth-surgery \
python3dist-gnuhealth-surgery-protocols \
python3dist-gnuhealth-webdav3-server \
python3dist-gnuhealth-who-essential-medicines"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
bsdtar \
gnu-free-fonts \
proteus \
python-abi \
python3-Pillow \
python3-PyWebDAV3-GNUHealth \
python3-Werkzeug \
python3-bcrypt \
python3-caldav \
python3-hl7apy \
python3-ldap \
python3-matplotlib \
python3-numpy \
python3-passlib \
python3-pycountry \
python3-pydot \
python3-python-barcode \
python3-python-magic \
python3-pytz \
python3-qrcode \
python3-simpleeval \
python3-six \
python3-vobject \
trytond \
trytond-account \
trytond-account-invoice \
trytond-account-invoice-stock \
trytond-account-product \
trytond-company \
trytond-country \
trytond-currency \
trytond-party \
trytond-product \
trytond-purchase \
trytond-purchase-request \
trytond-stock \
trytond-stock-lot \
trytond-stock-supply"

inherit rpm
