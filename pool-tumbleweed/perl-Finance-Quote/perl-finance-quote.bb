SUMMARY = "Get stock and mutual fund quotes from various exchanges"
DESCRIPTION = "This module gets stock quotes from various internet sources all over the \
world. Quotes are obtained by constructing a quoter object and using the \
fetch method to gather data, which is returned as a two-dimensional hash \
(or a reference to such a hash, if called in a scalar context). For \
example: \
 \
    $q = Finance::Quote->new; \
    %info = $q->fetch('australia', 'CML'); \
    print 'The price of CML is '.$info{'CML', 'price'}; \
 \
The first part of the hash (eg, 'CML') is referred to as the stock. The \
second part (in this case, 'price') is referred to as the label."
LICENSE = "GPL-2.0-or-later"

PV = "1.690.0"

RPM_NAME = "perl-Finance-Quote-1.690.0-1.3.noarch.rpm"
RPM_HASH = "1e95109509e67ce5710e68058b2554ce6bae4fc2eb4a99f013825114d316ba0fbdd4f7d40b3671da2cfe64755994f89bc84a5613c7dfbfe13b2d8ccd811b1948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Finance--Quote \
perl-Finance--Quote--AEX \
perl-Finance--Quote--ASEGR \
perl-Finance--Quote--ASX \
perl-Finance--Quote--AlphaVantage \
perl-Finance--Quote--BSEIndia \
perl-Finance--Quote--BVB \
perl-Finance--Quote--BorsaItaliana \
perl-Finance--Quote--Bourso \
perl-Finance--Quote--CSE \
perl-Finance--Quote--Comdirect \
perl-Finance--Quote--Consorsbank \
perl-Finance--Quote--Currencies \
perl-Finance--Quote--CurrencyRates--AlphaVantage \
perl-Finance--Quote--CurrencyRates--CurrencyFreaks \
perl-Finance--Quote--CurrencyRates--ECB \
perl-Finance--Quote--CurrencyRates--FinanceAPI \
perl-Finance--Quote--CurrencyRates--Fixer \
perl-Finance--Quote--CurrencyRates--OpenExchange \
perl-Finance--Quote--CurrencyRates--TwelveData \
perl-Finance--Quote--CurrencyRates--YahooJSON \
perl-Finance--Quote--Deka \
perl-Finance--Quote--FTfunds \
perl-Finance--Quote--FinanceAPI \
perl-Finance--Quote--Finanzpartner \
perl-Finance--Quote--Fondsweb \
perl-Finance--Quote--Fool \
perl-Finance--Quote--GoldMoney \
perl-Finance--Quote--GoogleWeb \
perl-Finance--Quote--IndiaMutual \
perl-Finance--Quote--MarketWatch \
perl-Finance--Quote--MorningstarCH \
perl-Finance--Quote--MorningstarJP \
perl-Finance--Quote--MorningstarUK \
perl-Finance--Quote--NSEIndia \
perl-Finance--Quote--NZX \
perl-Finance--Quote--OnVista \
perl-Finance--Quote--SIX \
perl-Finance--Quote--Sinvestor \
perl-Finance--Quote--StockData \
perl-Finance--Quote--Stooq \
perl-Finance--Quote--SwissFundData \
perl-Finance--Quote--TMX \
perl-Finance--Quote--TSP \
perl-Finance--Quote--TesouroDireto \
perl-Finance--Quote--Tradegate \
perl-Finance--Quote--TreasuryDirect \
perl-Finance--Quote--TwelveData \
perl-Finance--Quote--USBonds \
perl-Finance--Quote--Union \
perl-Finance--Quote--UserAgent \
perl-Finance--Quote--XETRA \
perl-Finance--Quote--YahooJSON \
perl-Finance--Quote--YahooWeb \
perl-Finance--Quote--ZA \
perl-Finance-Quote"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Zlib \
perl-Date--Parse \
perl-Date--Range \
perl-Date--Simple \
perl-DateTime--Format--ISO8601 \
perl-DateTime--Format--Strptime \
perl-Devel--Trace \
perl-HTML--Entities \
perl-HTML--TableExtract \
perl-HTML--TokeParser \
perl-HTML--TreeBuilder \
perl-HTML--TreeBuilder--XPath \
perl-HTTP--CookieJar--LWP \
perl-HTTP--Cookies \
perl-HTTP--Headers \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-HTTP--Status \
perl-IO--String \
perl-IO--Uncompress--Unzip \
perl-JSON \
perl-LWP--Protocol--http \
perl-LWP--Protocol--https \
perl-LWP--Simple \
perl-LWP--UserAgent \
perl-Module--Load \
perl-Mozilla--CA \
perl-Net--SSLeay \
perl-Readonly \
perl-Smart--Comments \
perl-String--Util \
perl-Test2 \
perl-Text--Template \
perl-Time--Piece \
perl-URI--Escape \
perl-Web--Scraper \
perl-XML--LibXML \
perl-YAML--PP--Perl"

inherit rpm
