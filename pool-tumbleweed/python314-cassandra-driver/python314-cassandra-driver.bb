SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.29.2"

RPM_NAME = "python314-cassandra-driver-3.29.2-1.7.aarch64.rpm"
RPM_HASH = "6283223c7b0073a7446f5d7d1eb6bf00f9fb2d6e57d944a0df252003595c10e6ac80271af26cc54df09fba826c100816cf9382148a6bdc703aaf127f62c2b727"

RPROVIDES:${PN} += "python3.14dist-cassandra-driver \
python314-cassandra-driver \
python3dist-cassandra-driver"

RDEPENDS:${PN} += "python-abi \
python314-Cython \
python314-geomet \
python314-pyasyncore"

inherit rpm
