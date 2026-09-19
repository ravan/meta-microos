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

RPM_NAME = "python311-sortinghat-1.5.1-1.2.noarch.rpm"
RPM_HASH = "26c1f9230b085a738533cb8dd1fdbecc0eebfd8897cbc3411573cf6174566b86020893747060b74dde1966dd2eb3cec286dc8eee59c3ffbc303a4cc6b79cca7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortinghat \
python3.11dist-sortinghat \
python311-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Django \
python311-Jinja2 \
python311-PyJWT \
python311-PyMySQL \
python311-PyYAML \
python311-SQLAlchemy \
python311-click \
python311-django-cors-headers \
python311-django-graphql-jwt \
python311-django-rq \
python311-django-treebeard \
python311-graphene \
python311-graphene-django \
python311-grimoirelab-toolkit \
python311-importlib-resources \
python311-mysqlclient \
python311-numpy \
python311-pandas \
python311-python-dateutil \
python311-requests \
python311-rq \
python311-setuptools \
python311-sgqlc \
update-alternatives"

inherit rpm
