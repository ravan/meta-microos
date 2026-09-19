SUMMARY = "A mailing list manager"
DESCRIPTION = "Mailman is a mailing list manager from the GNU project."
LICENSE = "GPL-3.0-only"

PV = "3.3.10"

RPM_NAME = "mailman3-3.3.10-3.5.noarch.rpm"
RPM_HASH = "e919b817a5533304d6bc7cf7df7ff68a4ae136e63806116b7ff76bedd425f8af9ac40bb872cded04f294758bc4deecf7ddc0318d79e0a66224bf95b8c2c78af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mailman3 \
mailman \
mailman3 \
python3.13dist-mailman \
python313-mailman \
python313-mailman3 \
python3dist-mailman"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
/usr/sbin/groupadd \
group-mail \
group-mailman \
logrotate \
python-abi \
python313-SQLAlchemy \
python313-aiosmtpd \
python313-alembic \
python313-atpublic \
python313-authheaders \
python313-authres \
python313-click \
python313-dnspython \
python313-falcon \
python313-flufl.bounce \
python313-flufl.i18n \
python313-flufl.lock \
python313-gunicorn \
python313-lazr.config \
python313-passlib \
python313-psycopg2 \
python313-python-dateutil \
python313-requests \
python313-standard-nntplib \
python313-zope.component \
python313-zope.configuration \
python313-zope.event \
python313-zope.interface \
update-alternatives \
user-mailman"

inherit rpm
