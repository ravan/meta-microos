SUMMARY = "(deprecated) polymorphic return values"
DESCRIPTION = "Polymorphic return values are a horrible idea, but this library was written \
based on the notion that they were useful. Often, we just want to know if \
something worked or not. Other times, we'd like to know what the error text \
was. Still others, we may want to know what the error code was, and what \
the error properties were. We don't want to handle objects or data \
structures for every single return value, but we do want to check error \
conditions in our code because that's what good programmers do. \
 \
When functions are successful they may return true, or perhaps some useful \
data. In the quest to provide consistent return values, this gets confusing \
between complex, informational errors and successful return values. \
 \
This module provides these features with a simplistic API that should get \
you what you're looking for in each context a return value is used in."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.666005"

RPM_NAME = "perl-Return-Value-1.666005-1.36.noarch.rpm"
RPM_HASH = "34725477961be4740fde7263e1b65c86d9d07c437254eb1af9cb866b55e9d551821a2403f2647497f549d6c8d35d21ef324b81a4fc89297feb063ec3adcbf202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Return--Value \
perl-Return-Value"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
