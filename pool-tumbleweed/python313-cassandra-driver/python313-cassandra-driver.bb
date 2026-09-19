SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.29.2"

RPM_NAME = "python313-cassandra-driver-3.29.2-1.7.aarch64.rpm"
RPM_HASH = "00c872ed90850271dcbe4c2f839754a7e29d209fd4ff2781dcc7e0f0736e7f14dd0b6ed44c488b59c36d4aebd25ed7baf802c9bcea3ec8d2834cd5025beccbf0"

RPROVIDES:${PN} += "python3-cassandra-driver \
python3.13dist-cassandra-driver \
python313-cassandra-driver \
python3dist-cassandra-driver"

RDEPENDS:${PN} += "python-abi \
python313-Cython \
python313-geomet \
python313-pyasyncore"

inherit rpm
