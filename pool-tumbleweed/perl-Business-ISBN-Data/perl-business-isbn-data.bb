SUMMARY = "Data pack for Business::ISBN"
DESCRIPTION = "You don't need to load this module yourself in most cases. Business::ISBN \
will load it when it loads. You must use Business::ISBN 3.005 or later \
because the data structure changed slightly to fix a bug with ISBN13 \
prefixes. \
 \
These data are generated from the _RangeMessage.xml_ file provided by the \
ISBN Agency. The distributed version matches the date in the version for \
this module. You can retrieve this yourself at \
https://www.isbn-international.org/range_file_generation. This file is \
included as part of the distribution and should be installed at \
_~lib/Business/ISBN/Data/RangeMessage.xml_. \
 \
If you want to use a different _RangeMessage.xml_ file, you can set the \
'ISBN_RANGE_MESSAGE' environment variable to the alternate location before \
you load 'Business::ISBN'. This way, you can use the latest (or even \
earlier) data without having to install something new or wait for an update \
to this module. \
 \
If the default _RangeMessage.xml_ or your alternate one is not available, \
the module falls back to data included in _Data.pm_. However, that data are \
likely to be older. If it does not find that file, it looks for \
_RangeMessage.xml_ in the current directory. \
 \
The data are in '%Business::ISBN::country_data' (although the 'country' \
part is historical). If you want to see where the data are from, check \
'$Business::ISBN::country_data{_source}'."
LICENSE = "Artistic-2.0"

PV = "20260907.1.0"

RPM_NAME = "perl-Business-ISBN-Data-20260907.1.0-1.1.noarch.rpm"
RPM_HASH = "5ccdd15ae5c0f1276a3939754ecd4f10089ebb5c33d55d1ba63c247744e11f9d0ba9ba0c9697f89e3beb35f7a330a52d70c6a74f7a532ab5272b03f4387980f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISBN--Data \
perl-Business-ISBN-Data"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
