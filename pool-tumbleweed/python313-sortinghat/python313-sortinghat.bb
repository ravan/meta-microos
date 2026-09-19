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

RPM_NAME = "python313-sortinghat-1.14.3-1.2.noarch.rpm"
RPM_HASH = "0aebf5bd9c89d7626273684dc1fa1e115c33c6bfaedd33a21010834815329f2579b1273d81371c897d877b44c41ce817cb49ff1dcf5631b15fbd85df280ea7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortinghat \
python3.13dist-sortinghat \
python313-sortinghat \
python3dist-sortinghat"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Django \
python313-Jinja2 \
python313-PyJWT \
python313-PyYAML \
python313-SQLAlchemy \
python313-click \
python313-django-cors-headers \
python313-django-graphql-jwt \
python313-django-rq \
python313-django-storages \
python313-django-treebeard \
python313-graphene-django \
python313-grimoirelab-toolkit \
python313-mysqlclient \
python313-pandas \
python313-python-dateutil \
python313-requests \
python313-rq \
python313-sgqlc \
update-alternatives"

inherit rpm
