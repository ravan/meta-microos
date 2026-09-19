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

PV = "1.5.1"

RPM_NAME = "python312-sortinghat-1.5.1-1.2.noarch.rpm"
RPM_HASH = "7149b18ef5ab07caed2a14e047638d113d5997744db1ea7be48b1a677b5bd68e1180a3ca483dbb91718a94904c8fe101277312b1ee86d653bd3c87b3796c653f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-sortinghat \
python312-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-Django \
python312-Jinja2 \
python312-PyJWT \
python312-PyMySQL \
python312-PyYAML \
python312-SQLAlchemy \
python312-click \
python312-django-cors-headers \
python312-django-graphql-jwt \
python312-django-rq \
python312-django-treebeard \
python312-graphene \
python312-graphene-django \
python312-grimoirelab-toolkit \
python312-importlib-resources \
python312-mysqlclient \
python312-numpy \
python312-pandas \
python312-python-dateutil \
python312-requests \
python312-rq \
python312-setuptools \
python312-sgqlc \
update-alternatives"

inherit rpm
