SUMMARY = "Unified cache handling interface"
DESCRIPTION = "CHI provides a unified caching API, designed to assist a developer in \
persisting data for a specified period of time. \
 \
The CHI interface is implemented by driver classes that support fetching, \
storing and clearing of data. Driver classes exist or will exist for the \
gamut of storage backends available to Perl, such as memory, plain files, \
memory mapped files, memcached, and DBI. \
 \
CHI is intended as an evolution of DeWitt Clinton's Cache::Cache package, \
adhering to the basic Cache API but adding new features and addressing \
limitations in the Cache::Cache implementation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.610.0"

RPM_NAME = "perl-CHI-0.610.0-1.7.noarch.rpm"
RPM_HASH = "1357236dba1207d4a3be1fa8324b8200e4aec0cfab8f28565bc7042d7cac75e5ed95e5e2633a078b53b14157629faff30286e65ec4b79be8acd51de7e96444d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CHI \
perl-CHI--CacheObject \
perl-CHI--Constants \
perl-CHI--Driver \
perl-CHI--Driver--Base--CacheContainer \
perl-CHI--Driver--CacheCache \
perl-CHI--Driver--FastMmap \
perl-CHI--Driver--File \
perl-CHI--Driver--Memory \
perl-CHI--Driver--Metacache \
perl-CHI--Driver--Null \
perl-CHI--Driver--RawMemory \
perl-CHI--Driver--Role--HasSubcaches \
perl-CHI--Driver--Role--IsSizeAware \
perl-CHI--Driver--Role--IsSubcache \
perl-CHI--Driver--Role--Universal \
perl-CHI--Stats \
perl-CHI--Types \
perl-CHI--Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp--Assert \
perl-Class--Load \
perl-Data--UUID \
perl-Digest--JHash \
perl-Hash--MoreUtils \
perl-JSON--MaybeXS \
perl-List--MoreUtils \
perl-Log--Any \
perl-Moo \
perl-MooX--Types--MooseLike \
perl-MooX--Types--MooseLike--Base \
perl-MooX--Types--MooseLike--Numeric \
perl-String--RewritePrefix \
perl-Task--Weaken \
perl-Time--Duration \
perl-Time--Duration--Parse \
perl-Try--Tiny"

inherit rpm
