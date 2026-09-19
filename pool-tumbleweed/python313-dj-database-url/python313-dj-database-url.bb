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

RPM_NAME = "python313-dj-database-url-3.1.2-1.2.noarch.rpm"
RPM_HASH = "6a63b50312b1f125f99748c56e5dcbddbcde6d81632607a9e380651d67f6370eaf9f6424956ce95e696d8b63b455f0cffacd367929b79b21c330e941996e3467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dj-database-url \
python3.13dist-dj-database-url \
python313-dj-database-url \
python3dist-dj-database-url"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
