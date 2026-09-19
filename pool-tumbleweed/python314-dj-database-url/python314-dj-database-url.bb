SUMMARY = "Utility to use database URLs in Django applications"
DESCRIPTION = "This Django utility allows you to utilize the 12factor inspired \
DATABASE_URL environment variable to configure Django applications. \
 \
The `dj_database_url.config` method returns a Django database connection \
dictionary, populated with all the data specified in your URL. There is \
also a `conn_max_age` argument to easily enable Django's connection pool. \
 \
If you'd rather not use an environment variable, you can pass a URL in directly \
instead to ``dj_database_url.parse``. \
 \
Supported Databases \
------------------- \
 \
Support currently exists for PostgreSQL, PostGIS, MySQL, MySQL (GIS), \
Oracle, Oracle (GIS), and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python314-dj-database-url-3.1.2-1.2.noarch.rpm"
RPM_HASH = "72cb61d9bd3c39760d1f101feb2db8a4122733d63a727210276961c478ff5f05970b75b77fa09cde7e6862728209cc909ba333fc200b19b1ed522ba9058ce943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dj-database-url \
python314-dj-database-url \
python3dist-dj-database-url"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
