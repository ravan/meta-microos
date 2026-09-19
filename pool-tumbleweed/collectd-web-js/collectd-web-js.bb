SUMMARY = "Web/JavaScript Frontend for watching collectd Statistics"
DESCRIPTION = "Web/JavaScript frontend CGI for watching collectd statistics from \
a browser. \
 \
Please look at /etc/apache2/conf.d/collectd-js.conf on how to \
enable."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-web-js-5.12.0.382.g2cd055fe-3.1.noarch.rpm"
RPM_HASH = "d30671471faf2c51baaa667cec19c17177fc06e98ffd20e5aecf28313d08227c98c323181835dede22bc4cb5ce8930455b9293f339ccd999fed2ec80d9165d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-web-js \
config-collectd-web-js \
perl-Collectd--Graph--Common \
perl-Collectd--Graph--Config \
perl-Collectd--Graph--Type \
perl-Collectd--Graph--Type--ArcCounts \
perl-Collectd--Graph--Type--Df \
perl-Collectd--Graph--Type--GenericIO \
perl-Collectd--Graph--Type--GenericStacked \
perl-Collectd--Graph--Type--JavaMemory \
perl-Collectd--Graph--Type--Load \
perl-Collectd--Graph--Type--PsCputime \
perl-Collectd--Graph--Type--TableSize \
perl-Collectd--Graph--Type--Wirkleistung \
perl-Collectd--Graph--TypeLoader"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2 \
perl \
perl-CGI \
perl-Config--General \
perl-Data--Dumper \
perl-HTML--Entities \
perl-JSON \
perl-RRDs \
rrdtool"

inherit rpm
