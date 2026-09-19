SUMMARY = "Simple CSV file parser for the UNIX command line"
DESCRIPTION = "csvprintf is a simple UNIX command line utility for parsing CSV files. \
 \
csvprintf works like the printf(1) command line utility: you supply a \
printf(1) format string on the command line, and each row of the CSV file \
is split into arguments and formatted accordingly. The format specifiers \
in the format string contain numeric or symbolic column accessors to \
specify which CSV column to format. \
 \
csvprintf can also convert CSV files into XML and JSON documents \
and Bash variable assignments suitable for eval(1)."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "csvprintf-1.3.4-1.3.aarch64.rpm"
RPM_HASH = "f1846b9fd76312f0f2f14e01d12a840817abbdfaa08aaf9f52945bb9e18dba1dd88b9c602135d8fb3aac4bf34a63abe64f416bbf7c721c222d3fafb22e308393"

RPROVIDES:${PN} += "csvprintf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
xsltproc"

inherit rpm
