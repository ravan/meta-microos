SUMMARY = "A git-centered forge"
DESCRIPTION = "Pagure is a git-centered forge based on pygit2. \
 \
Currently, Pagure offers a web-interface for git repositories, a ticket \
system and possibilities to create new projects, fork existing ones and \
create/merge pull-requests across or within projects. \
 \
For steps on how to set up the system after installing this package, \
please read /usr/share/doc/packages/pagure/README.SUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-5.14.1-3.3.noarch.rpm"
RPM_HASH = "b6af2f87a657abd9a165cc699d8ed574003641a698a43b166f6d7d26d6b718f6974f07abd2d47a4a9aeb3a6de3dc59a0a14d323dc93c7ab4518d4fcd1d760207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pagure \
pagure \
python3.13dist-pagure \
python3dist-pagure"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
git-core \
gitolite \
group-git \
openssh \
pagure-theme-default \
python3-Flask \
python3-Flask-WTF \
python3-Markdown \
python3-Pillow \
python3-SQLAlchemy \
python3-WTForms \
python3-alembic \
python3-arrow \
python3-bcrypt \
python3-binaryornot \
python3-bleach \
python3-blinker \
python3-celery \
python3-chardet \
python3-cryptography \
python3-dbm \
python3-docutils \
python3-email-validator \
python3-kitchen \
python3-munch \
python3-psutil \
python3-pygit2 \
python3-python-openid-cla \
python3-python-openid-teams \
python3-python3-openid \
python3-pytz \
python3-redis \
python3-requests \
python3-straight-plugin \
python3-whitenoise \
user-git \
user-wwwrun"

inherit rpm
