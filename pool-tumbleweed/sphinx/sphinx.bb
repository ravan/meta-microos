SUMMARY = "SQL full-text search engine"
DESCRIPTION = "Sphinx is a standalone search engine providing size-efficient and \
relevant full-text search functions to other applications. Sphinx \
integrates with SQL databases and scripting languages. \
 \
Data source drivers support fetching data either via direct \
connection to MySQL, PostgreSQL, or from a pipe in a custom XML \
format. \
 \
The Search API is natively ported to PHP, Python, Perl, Ruby, Java, \
and also available as a pluggable MySQL storage engine. \
 \
Sphinx is an acronym which is officially decoded as SQL Phrase Index."
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "sphinx-2.2.11-10.10.aarch64.rpm"
RPM_HASH = "438e026c9fb4c76b610708138e832058ac547eeed664d6275704d026d2c5ab9bfdefbae789e2efad11b6d1261b387bccaa2c210a9a8a610854ac0dded3b0dc3f"

RPROVIDES:${PN} += "config-sphinx \
group-sphinx \
searchd \
sphinx \
user-sphinx"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libstdc++.so.6 \
libz.so.1 \
logrotate \
sysuser-shadow"

inherit rpm
