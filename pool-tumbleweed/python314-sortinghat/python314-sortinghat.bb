SUMMARY = "A tool to manage identities"
DESCRIPTION = "A tool to manage identities. \
 \
Sorting Hat maintains an SQL database with identities coming \
(potentially) from different sources. Identities corresponding to the \
same real person can be merged in the same unique identity, with a \
unique uuid. For each unique identity, a profile can be defined, with \
the name and other data to show for the corresponding person by default. \
 \
In addition, each unique identity can be related to one or more \
affiliations, for different time periods. This will usually correspond \
to different organizations in which the person was employed during those \
time periods. \
 \
Sorting Hat is a part of the GrimoireLab \
toolset <https://grimoirelab.github.io>, which provides for Python \
modules and scripts to analyze data sources with information about \
software development, and allows to produce interactive dashboards to \
visualize that information. \
 \
In the context of GrimoireLab, Sorting Hat is usually run after data is \
retrieved with Perceval <https://github.com/grimmoirelab/perceval>, \
to store the identities obtained into its database, and later merge them \
into unique identities (and maybe affiliate them)."
LICENSE = "GPL-3.0-only"

PV = "1.14.3"

RPM_NAME = "python314-sortinghat-1.14.3-1.2.noarch.rpm"
RPM_HASH = "037a4065e6509a6add0327c9adee79b6bc14da8ea4c354fad4513c9a21a2f6b5c17d9eb010a4814366d10e3e2e3b89d1036a45e75589b03558defc8a9ea21cfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sortinghat \
python314-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Django \
python314-Jinja2 \
python314-PyJWT \
python314-PyYAML \
python314-SQLAlchemy \
python314-click \
python314-django-cors-headers \
python314-django-graphql-jwt \
python314-django-rq \
python314-django-storages \
python314-django-treebeard \
python314-graphene-django \
python314-grimoirelab-toolkit \
python314-mysqlclient \
python314-pandas \
python314-python-dateutil \
python314-requests \
python314-rq \
python314-sgqlc \
update-alternatives"

inherit rpm
