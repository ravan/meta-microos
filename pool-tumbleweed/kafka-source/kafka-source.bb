SUMMARY = "Source code of Apache Kafka"
DESCRIPTION = "Source code of the Kafka distributed streaming platform."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "kafka-source-2.1.0-3.18.aarch64.rpm"
RPM_HASH = "c6025ff939bb701d837b9f3b8958473eef832671a28058dc227f83db9c6be13f9e324627ddf06d14ebe148a885a58369cf8fc63fb2002c08a0658c6d3a66e67f"

RPROVIDES:${PN} += "kafka-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh"

inherit rpm
