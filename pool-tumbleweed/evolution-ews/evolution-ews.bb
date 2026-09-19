SUMMARY = "Exchange Connector for Evolution, compatible with Exchange 2007 and later"
DESCRIPTION = "The EWS Exchange Connector for Evolution provides a Exchange \
backend from evolution-data-server as well as plugins for Evolution \
to access Exchange features. \
 \
The EWS Exchange Connector is using the Exchange Web Services \
interface and is therefore compatible with Exchange 2007 and later. \
 \
Provides exchange connectivity for exchange server 2007 and later \
using exchange web services protocol."
LICENSE = "LGPL-2.1-only"

PV = "3.60.2"

RPM_NAME = "evolution-ews-3.60.2-1.2.aarch64.rpm"
RPM_HASH = "6a6ddab1e5fdcb70c8ecc05d3b29886148545a478fdf747b044a69cd0553dc57c23559f24843de66f0ca314104ea5b2b6f5a01f02c3c90eef759ab1cfc91cee6"

RPROVIDES:${PN} += "evolution-ews \
libcamelews-priv.so \
libcamelews.so \
libcamelmicrosoft365-priv.so \
libcamelmicrosoft365.so \
libebookbackendews.so \
libebookbackendmicrosoft365.so \
libecalbackendews.so \
libecalbackendmicrosoft365.so \
libevolution-ews-common.so \
libevolution-ews.so \
libevolution-microsoft365.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libebackend-1.2.so.11 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.5 \
libecal-2.0.so.3 \
libedata-book-1.2.so.27 \
libedata-cal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
libemail-engine.so \
libevolution-calendar.so \
libevolution-mail-composer.so \
libevolution-mail-formatter.so \
libevolution-mail.so \
libevolution-shell.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical-glib.so.3 \
libjson-glib-1.0.so.0 \
libmspack.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
